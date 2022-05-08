package com.gl.Manjali.Problem1.FloorPlan;

public class FloorBuildOrder {
	
	private static final Queue[] BuildOrder = null;

	public static Queue[] bulid(int[] FloorSizeArr) {
		int numDays = FloorSizeArr.length;
		Queue[] BuildOrder = new Queue[numDays];
		int[][] FloorPlan = new int[numDays][2];
		
		for (int i = 0; i < numDays; i++) {
			FloorPlan[i][0] = FloorSizeArr[i];
			FloorPlan[i][1] = i + 1;
			BuildOrder[i] = new Queue(numDays);
		}
		
		MergeSort.sort(FloorPlan);
		
		int index = 0;
		for (int i = 0; i < numDays; i++) {
			if (FloorPlan[index][1] < i + 1)
				continue;
			
			while (index < numDays && FloorPlan[index][1] <= i + 1) {
				BuildOrder[i].insert(FloorPlan[index][0]);
				index++;
			}
		}
		
		return BuildOrder;
	}

	public static Queue[] build(int[] floorSizeArr) {
		return BuildOrder;
	}

}
