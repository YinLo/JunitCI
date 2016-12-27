package ntou.cs.sorter;

public class MySorter
{
	public void sort(double[] d) {

		boolean start = true;	//是否要排序變數

		//檢查陣列是否有負數，如果有start = false;
		for (int i = 0; i < d.length - 1; i++) {
			if (d[i] < 0) {
				start = false;
				break;
			}
		}

		if (start) {
			for (int i = 0; i < d.length - 1; i++) {
				for (int j = 0; j < d.length - i - 1; j++) {
					if (Math.abs(d[j]) > Math.abs(d[j + 1])) {
						swap(d, j, j + 1);
					}
				}
			}
		}
	}

	public void swap (double d[], int k, int s)
	{
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}
