public class IsItEquil {

    private int sumx,sumy,sumz,row;

    IsItEquil(int row){

        sumx=0;
        sumy=0;
        sumz=0;
        this.row = row;
    }
    public String isEquil(int[][] arr){
        if (row <1 || row >100) {
            return "ERROR";

        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < -100 || arr[i][j] > 100){
                    return "ERROR";

                }

            }

        }


        for (int i=0;i < row ;i++){
            sumx=sumx+arr[i][0];
            sumy=sumy+arr[i][1];
            sumz=sumz+arr[i][2];
        }

        if(sumx==0 && sumy == 0 && sumz ==0)
            return "YES";
        else return "NO";


    }
}
