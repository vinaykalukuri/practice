class Jacked{
    public static void main(String []args){
        int jacked[][]={
            {1,2,3},
            {4,5},
            {6,7,8}
        };

        
        for(int i=0;i<jacked.length;i++){
            for(int j=0;j<jacked[i].length;j++){
                System.out.print(jacked[i][j]);
            }
            System.out.println();
        }
        
        
    }
}