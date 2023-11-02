package ch07;


// Parseable를 구현한 클래스의 인스턴스를 가져와서 Parseable에 있는 메서드를 사용하면 실제 객체의 메서드가 호출됨
// 그리고 참고사항: Object의 메서드는 인터페이스형 변수 여도 사용가능 모든 클래스가 공통으로 가지고 있기 때문에 허용한다.
interface Parseable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParseManager{
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        } else{
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "-HTML parsing completed.");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
