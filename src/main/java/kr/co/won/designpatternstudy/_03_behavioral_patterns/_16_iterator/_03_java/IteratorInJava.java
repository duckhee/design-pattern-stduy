package kr.co.won.designpatternstudy._03_behavioral_patterns._16_iterator._03_java;


import kr.co.won.designpatternstudy._03_behavioral_patterns._16_iterator._02_after.Board;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorInJava {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        Enumeration enumeration;
        Iterator iterator;

        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

//        board.getPosts().iterator().forEachRemaining(p -> System.out.println(p.getTitle()));


        // TODO Streaming API for XML(StAX), 이터레이터 기반의 API 읽고 쓰기 가능
        // TODO SAX Simple API for Xml 다른 것이다. 읽어 들릴때만 사용 가능
        // TODO console 부분은 하나의 Instance가 지나가면서 바뀌는 형태이다. -> 메모리적으로나 성능적으로 Console 기반의 API가 좀 더 효율적이다.
        // TODO 재사용성을 증가하기 위해서는 iterator를 사용을 하는 것이 재 사용성이 좋다.
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("Book.xml"));

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                QName name = startElement.getName();
                if (name.getLocalPart().equals("book")) {
                    Attribute title = startElement.getAttributeByName(new QName("title"));
                    System.out.println(title.getValue());
                }
            }
        }
    }
}
