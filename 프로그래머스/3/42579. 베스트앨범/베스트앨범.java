import java.util.*;


class Song implements Comparable<Song>{
    int idx,plays;
    
    Song(int idx,int plays){
        this.idx = idx;
        this.plays = plays;
    }
    
    @Override
    public int compareTo(Song s){
        if(this.plays==s.plays)
            return this.idx - s.idx;
        return s.plays - this.plays;
    }
}

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        int n = genres.length;
        List<Integer> answer = new ArrayList<>();
        Map<String,Integer> genreTotal = new HashMap<>();
        Map<String, List<Song>> genreSongs = new HashMap<>();
        
        for(int i=0;i<n;i++){
            genreTotal.put(genres[i],genreTotal.getOrDefault(genres[i],0)+plays[i]);
            if(!genreSongs.containsKey(genres[i])){
                genreSongs.put(genres[i],new ArrayList<>());
            }
            genreSongs.get(genres[i]).add(new Song(i,plays[i]));
        }
        
        for(String k:genreSongs.keySet()){
            Collections.sort(genreSongs.get(k));
        }
        
        List<String> genreOrder = new ArrayList<>(genreTotal.keySet());
        genreOrder.sort((k1,k2) -> genreTotal.get(k2)-genreTotal.get(k1));
        
        for(String k:genreOrder){
            int limit = Math.min(2,genreSongs.get(k).size());
            
            for(int i=0;i<limit;i++){
                answer.add(genreSongs.get(k).get(i).idx);
            }
        }
        
        return answer;
    }
}