package main.java.ch09_collection_generic.collection.set.ex;

import java.util.*;

// Collection List, Set, Map
public class SetEx {
    // 배열과 계속 비교하면서 설명을 들었던
    // 컬렉션 특징 : 객체만 저장, 크기 제한 X (알아서 늘고 줄음), 다양한 기능 제공

    // Set(집합) => 주머니라고 생각
    // - 중복 데이터 저장 불가 (똑같은 것 또 집어넣으면 덮어씌워버림)
    // - 순서를 유지하지 않는다. (index 없음)
    //    -> get() 메서드가 없다. (==> List와 다른 큰 차이.)

    public void ex1() {
        // 기본적인 Set 사용법

        // HashSet : hashCode()를 이용해서 중복 비교
       //  사용 조건 1 : 저장되는 객체에 hashCode() 오버라이딩 필수!
       //  사용 조건 2 : 저장되는 객체에 equlas() 오버라이딩 필수!

        // Set set = new Set() { // 이렇게 쓰면 Set은 추상메서드라서 오류가 뜸 따라서, 오버라이딩(HashSet)을 해야함.
        // String, Integer 등 Java에서 제공하는 객체는
        // 기본적으로 hashCode(), equals() 등이 오버라이딩 되어 있다.
        Set<String> set = new HashSet</* String*/>();
                                        // => 써도 되도 안써고 된다. 어차피 부모의 String을 가져오기 때문



        // 1. boolean set.add(E e) : 추가
        set.add("딸기"); // get(index번호처럼) 크기를 지정안해도 알아서 맞춰진다!
        set.add("바나나"); // get(index번호처럼) 크기를 지정안해도 알아서 맞춰진다!
        set.add("망고"); // get(index번호처럼) 크기를 지정안해도 알아서 맞춰진다!
        set.add("배"); // get(index번호처럼) 크기를 지정안해도 알아서 맞춰진다!


        System.out.println(set);
        // HashSet은 순서 유지가 안된다! (올랜덤)

        // 중복저장 여부 확인
        set.add("망고");
        set.add("망고");
        set.add("망고");

        System.out.println(set);

        // null값은 과연 중복이 될까? 아니 들어갈까?
        // set에 null 저장가능한데, 중복은 마찬가지로 안된다.
        set.add(null);
        set.add(null);
        set.add(null);

        System.out.println(set);



        // 2. int set.size() : 저장된 객체의 수를 반환해준다.
        System.out.println(set.size()); // null 포함해서 6개가 나와야 한다.



        // 3. boolean remove(E e)
        // - 매개변수 e와 똑같은 요소가 있으면 제거하고, true를 반환하고
        //   없으면 false를 반환한다.

        // set에 딸기가 존재한다면
        // "딸기1"로 바꾸면 어떻게 되나?
        if(set.remove ("딸기1")){
            System.out.println("딸기가 제거되었습니다.");
        } else {
            System.out.println("딸기가 없습니다.");
        }

        System.out.println(set);



        // 4.boolean set.contians(E e)
        //   ==> set.contains(E e)를 호출했을 때 true | False로 반환하는 반환형인 boolean
        // - set에 저장된 객체 중 e와 똑같은 객체가 있으면 true,
        //   없으면 false 반환

        // 망고가 있다면 : 망고 있음
        // 망고가 없다면 : 망고 없음
        System.out.println( set.contains("망고") ? "망고 있음" : "망고 없음");
        // 더 짧게 쓰고싶다면,
        // System.out .println("망고" + (set.contains("망고") ? " 있음" : " 없음"));



        // 5. void set. clear() : set에 저장된 객체 모두 지움
        // 출력할 것이 없는데 print를 쓰면 void가 되어 반환값이 없는 오류가 생김
        // System.out.println(set.clear());
        set.clear();
        System.out.println(set);
        System.out.println(set.size());



        // 6. boolean set.isEmpty()
        // - set에 저장된 객체가 없다면(비어있다면) true, 아니면 false
        System.out.println("set이 " + (set.isEmpty() ? "비어있음" : "비어있지 않음"));
        System.out.println("set이 " + (set.size() == 0 ? "비어있음" : "비어있지 않음"));
        // isEmpty를 쓰든, size() == 0이든, 안에 값이 있는지 없는지에 대해 물어보는 같은 코드이다



    }

    public void ex2(){
        // Set에 저장된 값 꺼내 쓰기

        Set<String> set = new HashSet<>();
        set.add("딸기라떼");
        set.add("토피넛라떼");
        set.add("흑임자라떼");
        set.add("아바라");

        // 1. Iterator(반복자)
        // - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
        //   ( 컬렉션에 저장된 데이터를 임의로 하나씩 반복적으로 꺼내는 역할을 하는 친구다. )

        // Iterator set.iterator()
        // set의 내용을 순차(반복) 접근할 수 있는 형태로 변경해서 반환해준다.
        Iterator<String> it = set.iterator();

        // boolean it.hasNext()
        // - 다음 꺼낼 요소가 있으면 true, 없으면 false를 반환
        while(it.hasNext()){

            // E it.next() : 다음 요소를 꺼내서 반환
            System.out.println(it.next()); // 그냥 꺼내는 것


        }

        // -----------------------------------------------
        System.out.println("------------------------------");

        // 2. 향상된 for문으로 (이게 더 편해서 이걸로 채택)
        // for( 자료형 변수명 : 배열명 또는 컬렉션명 ){}
        for( String str : set) {
            System.out.println(str);
        }
        // set은 index가 없지만 이렇게 반복 접근해서 쓸 수 있다.
    }

    public void lotto() {
        // 로또 번호 (1~45 난수, 6개 뽑기, 중복X, 오름차순)

        Random random = new Random(10); // 난수 객체 생성
//        Set<Integer> lotto = new HashSet<>(); // int는 기본자료형이라서 안된다.
//        Set<Integer> lotto = new LinkedHashSet<>(); // 순서 유지
        Set<Integer> lotto = new TreeSet<>(); // 오름차순

        System.out.println(lotto.size()); // 처음 만들면 10개가 아니라 0개

        // lotto에 저장된 난수가 6개 미만이면 반복
        while(lotto.size() < 6) {

            // random.nextInt(n) : 0 <= x < n
            //                     0 이상 n 미만 난수 하나
            lotto.add(random.nextInt(45) + 1);
            // int값이 자동으로 Integer로 포장(Auto Boxing)되어 lotto에 추가

            System.out.println(lotto + " ");
        }
        System.out.println("최종 결과 : " + lotto);
    }
}



