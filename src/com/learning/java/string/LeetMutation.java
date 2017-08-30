package com.learning.java.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LeetMutation {

	public static int minMutation(String start, String end, String[] bank) {
		if(start.equals(end))
			return 0;
		
		if(bank.length == 0 || start.length() != end.length()){
			return -1;
		}
		
		int[][] bankGraph  = new int[bank.length + 1][bank.length + 1];
		HashMap<String, Integer> hm = new HashMap<>();
		int vertex_id = 0;

		//initializing step
		int endIndex = -1;
		for(int i = 0; i <= bank.length; i++){
			for(int j = 0; j <= bank.length; j++){
				bankGraph[i][j] = 0;
			}
		}
		
		hm.put(start, 0);

		for(int i = 0; i < bank.length; i++){
			if(hm.containsKey(bank[i]))
				continue;
			
			for (Map.Entry<String, Integer> e : hm.entrySet()) {
                if (isDifference(e.getKey(), bank[i]) == 1) {
                    bankGraph[e.getValue()][vertex_id + 1] = 1;
                    bankGraph[vertex_id + 1][e.getValue()] = 1;
                }
            }
			hm.put(bank[i], ++vertex_id);
			if(bank[i].equals(end)){
				endIndex = vertex_id;
			}
		}
		return bfs(bankGraph, 0, endIndex);
	}
	
	private static int bfs(int[][] bankGraph, int start, int endIndex) {
		int dist = 0;
		ArrayList<Queue<Integer>> allPath = new ArrayList<>();
		Queue<Integer> currentQ = new LinkedList<>();
		Boolean bfsRemaining = true;
		int[] visited = new int[bankGraph.length];
		
		for(int i = 0; i < bankGraph.length; i++)
			visited[i] = 0;
		
		currentQ.add(start);
		
		while(bfsRemaining){
			allPath.add(currentQ);
			Queue<Integer> newQueue = new LinkedList<>();
			
			while(!currentQ.isEmpty()){
				int currentVertex =   currentQ.poll();
				visited[currentVertex] = 1;
				
				for(int i = 0; i < bankGraph[currentVertex].length; i++){
					if(visited[i] == 1)
						continue;
					if(bankGraph[currentVertex][i] == 1){
						newQueue.add(i);
						if(i == endIndex){
							return allPath.size();
						}
						
					}
				}
				
			}
			if(newQueue.isEmpty()){
				bfsRemaining = false;
			}else{
				currentQ = newQueue;
			}
		}
		
		return -1;
	}

	private static int isDifference(String key, String string) {
		int difference = 0;
		for(int i = 0; i < key.length(); i++){
			if(key.charAt(i) != string.charAt(i))
				difference++;
			
		}
		return difference;
	}

	public static void main(String[] args) {
		String start = "AACCGGTT";
		String end = "AACCGGTA";
		String[] bank = {"AACCGGTA"};
		System.out.println(minMutation(start, end, bank));
		/*String start = "AAAAACCC";
		String end = "AACCCCCC";
		String[] bank = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};
		System.out.println(minMutation(start, end, bank));*/
	}

}
/*"AACCGGTT"
"AACCGGTA"
["AACCGGTA"]*/

/*"AACCGGTT"
"AACCGCTA"
["AACCGGTA"
"AACCGCTA"
"AAACGGTA"]*/