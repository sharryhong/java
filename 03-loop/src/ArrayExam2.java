public class ArrayExam2{
  public static void main(String[] args){
    int [][] array = {{1},{1,2},{1,2,3},{1,2,3,4}};
    
    //2���� �迭 array�� ����մϴ�.
    for(int i = 0 ; i < array.length ; i++){
      System.out.print((i+1) + "��° ���� ����մϴ�>");
      for(int j = 0; j< array[i].length ; j++){
        //System.out.print�� ���� �ٲ��� �ʰ� ����ϴ� �ڵ��Դϴ�.
        System.out.print(array[i][j]+" ");
      }
      System.out.println("");//�ٹٲ��� �� �ִ� �ڵ��Դϴ�.
    }
  }
}