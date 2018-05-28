package code.refactoring.complex_1;

/**
 * �� Ŭ������ ����ڰ� ������ �ִ� ������ �Ҽ��� �����Ѵ�. ���� �˰����� ��������׽��� ü��.
 * <P>
 * �������׳׽� : ����� 276�⿡ ����� Ű���׿��� ���, ����� 194�� ���
 * ���� �ѷ��� ���ʷ� ����� ������� �޷¿� ������ ������ ���
 * �˷���帮�� ���������� ����
 * <P>
 * �˰����� ����� �ܼ��ϴ�. 2���� �����ϴ� ���� �迭�� �������
 * 2�� ����� ��� �����Ѵ�. ������ ���� ������ ã�� �� ������ ����� ��� �����.
 * �ִ� ���� �������� �� ������ �̸� �ݺ��Ѵ�.
 * 
 * @author Bob
 * @version 2012.02.13
 *
 */
public class GeneratePrimes {
	
	private boolean[] crossedOut;
	private int[] primes;
	
	public int getPrimes(int maxValue) {
		if (maxValue >= 2) { //유일하게 유효한 경우
			// 선언
			initData(maxValue);
			// 소스 개수?
			printPrime();
			
			System.out.println("primes ���� " + primes.length + "�� �Դϴ�.");
		}
		else	// maxValue < 2
		    System.out.println("primes 1.");
		
		return primes.length;
	}

	private void printPrime() {
		primes = new int[primeCount()];
		for(int i=0, j=0; i<crossedOut.length; i++) {
			if (crossedOut[i])	// �Ҽ��ϰ�쿡
				primes[j++] = i;
		}
	}

	private int primeCount() {
		int primesCount = 0;
		for (int i=0; i<crossedOut.length; i++) {
			if (crossedOut[i]) {
				primesCount++; //ī��Ʈ ����
			}
		}
		return primesCount;
	}

	private void initData(int maxValue) {
		crossedOut = new boolean[maxValue + 1];
		int i;
		
		// 배열 초기화
		for (i=0; i<crossedOut.length; i++) 
			crossedOut[i] = true;
		// �Ҽ��� �ƴ� �˷��� ���ڸ� ����
		crossedOut[0] = crossedOut[1]= false;
		
		int j;
		
		for(i=2; i<Math.sqrt(crossedOut.length)+1; i++) {
			if(crossedOut[i]) {	// i�� �����ִ� ���ڶ�� �� ������ ����� ���Ѵ�.
				for (j=2*i; j<crossedOut.length; j+=i) {
				    crossedOut[j] = false; // ����� �Ҽ��� �ƴϴ�.
				}
			}
		}
	}

}
