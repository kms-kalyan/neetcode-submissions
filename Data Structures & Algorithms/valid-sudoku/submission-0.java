class Solution {
    public boolean isValidSudoku(char[][] b) {
        List<List<Character>> row = new ArrayList<>();
        List<List<Character>> col = new ArrayList<>();
        List<List<Character>> rc = new ArrayList<>();
        
        for(int i=0;i<9;i++){
            row.add(new ArrayList<>());
            col.add(new ArrayList<>());
            rc.add(new ArrayList<>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j] == '.')
                    continue;
                
                int in = (i/3) * 3 + (j/3);
                if(row.get(i).contains(b[i][j]))
                    return false;
                if(col.get(j).contains(b[i][j]))
                    return false;
                if(rc.get(in).contains(b[i][j]))
                    return false;
                
                row.get(i).add(b[i][j]);
                col.get(j).add(b[i][j]);
                rc.get(in).add(b[i][j]);
            }
        }

        return true;
    }
}
