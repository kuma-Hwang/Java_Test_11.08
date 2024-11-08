public class Test03Exam extends Test03 {
    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    // add 메서드를 오버로딩하여 3개의 숫자를 더하는 메서드 추가
    public int add(int a, int b, int c) {
        return a + b + c;  // a, b, c 세 숫자의 합을 반환
    }
}
