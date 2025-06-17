package preclass;

public class _02_Preclass {
    public static void main(String[] args) {
        // 1. 출력문 연습
        System.out.println("안녕하세요! 자바의 세계에 오신 것을 환영합니다.");
        System.out.println("오늘은 자바의 기초를 함께 배워볼 거예요.\n");

        // 2. 변수와 자료형
        // 정수형(int), 실수형(double), 문자형(char), 문자열(String), 논리형(boolean)
        int age = 25;                  // 나이를 저장하는 변수 (정수)
        double height = 172.5;         // 키 (실수)
        char bloodType = 'O';          // 혈액형 (문자 하나)
        String name = "홍길동";         // 이름 (문자열)
        boolean isStudent = true;      // 학생 여부 (참/거짓)

        // 출력해보기
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height + "cm");
        System.out.println("혈액형: " + bloodType + "형");
        System.out.println("학생인가요? " + isStudent);
        System.out.println(); // 줄바꿈

        // 3. 조건문 if 문
        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        // boolean 값을 조건으로 바로 사용 가능
        if (isStudent) {
            System.out.println("학생 할인 대상입니다!");
        }

        System.out.println();

        // 4. 반복문 for 문
        System.out.println("★을 5번 출력해볼게요!");
        for (int i = 0; i < 5; i++) {
            System.out.println("★");
        }

        System.out.println();

        // 5. 배열 (리스트처럼 여러 값 저장)
        String[] fruits = {"사과", "바나나", "딸기", "포도"};

        // 배열의 길이 구하기
        System.out.println("과일 목록 (" + fruits.length + "개):");

        // 반복문으로 배열 출력
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }

        System.out.println();

        // 6. 배열과 조건문 응용
        System.out.println("딸기가 포함되어 있을까요?");
        boolean hasStrawberry = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("딸기")) {
                hasStrawberry = true;
                break;
            }
        }

        if (hasStrawberry) {
            System.out.println("딸기가 포함되어 있어요!");
        } else {
            System.out.println("딸기는 없어요.");
        }

        System.out.println();

        // 7. 보너스: 변수값 바꿔보기
        age = 15;
        isStudent = false;
        System.out.println("나이를 15로 바꾸면 성인인가요?");
        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        System.out.println("학생인가요? " + isStudent);

        // 마무리 인사
        System.out.println("\n오늘 자바의 기초를 잘 따라오셨습니다! 👏");
    }

}
