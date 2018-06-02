package code.refactoring.complex_4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 변경부 -> 오버라이딩 구현
 */
public class UserDAO {
	
	// 문제점 
	// 중복코드 - QUery 와 인자를 뺴고는 모든내용이 중복 발생됨
	// 변경이 되는 부분과 변경이 되지 않는 부분으로 분리
	
	public void addUser(UserVO userVO) throws SQLException {
		String sql = "insert into USERS values (?,?,?,?) ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate() {
			
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userVO.getUserId());
				pstmt.setString(2, userVO.getPassword());
				pstmt.setString(3, userVO.getName());
				pstmt.setString(3, userVO.getEmail());				
			}
		};
		jdbcTemplate.addUser(sql);
	}

	public void removeUser(String userId) throws SQLException {
		String sql = "delete from USERS where userId = ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate() {

			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
			}
		};
		jdbcTemplate.removeUser(sql);
	}

	public void updateUser(UserVO updateUserVO) throws SQLException {
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate() {
			
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, updateUserVO.getPassword());
				pstmt.setString(2, updateUserVO.getName());
				pstmt.setString(3, updateUserVO.getEmail());
				pstmt.setString(4, updateUserVO.getUserId());
			}
			
		};
		jdbcTemplate.executeUpdate(sql);
	}
	
	public Object findByUserId(String userId) throws SQLException {
		String sql = "select * from USERS where userId = ?";
		JdbcTemSelect jdbcTemplate = new JdbcTemSelect() {

			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
			}

			@Override
			public UserVO mapRow(ResultSet rs) throws SQLException {
				if (!rs.next())
					return null;
			
				return new UserVO(rs.getString("userId"),
								rs.getString("password"),
								rs.getString("name"),
								rs.getString("email"));
			}
			
		};
		return (UserVO)jdbcTemplate.executeQuery(sql);
	}
}
