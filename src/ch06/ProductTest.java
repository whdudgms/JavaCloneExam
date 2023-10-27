package ch06;
//모든 클래스에서 사용하는 static 변수 count를 활용해서 고유한 serialNo를 만들어 줬다.
//어떻게 하냐면 객체 생성시에 매번 호출되는 인스턴스 초기화 블럭을 사용해서 만들었다.
// count값을 증가시켜서 serialNo에 저장하면 객체가 생성될 때마다 count값이 증가하므로 그 값을
// 저장하는 객체들은 고유의 serialNo를 갖게 된다.
class Product{
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product(){} //   기본생성자, 생략가능
}
public class ProductTest {
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는"+p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는"+p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는"+p3.serialNo);
        System.out.println("생상된 제품의 수는 모두"+Product.count+"개 입니다.");
    }

}
