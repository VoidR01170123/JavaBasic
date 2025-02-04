package review_복습;

/*

조건문 : if / switch

if(condition){
 조건이 참일 때 실행되는 코드
} else{
 만족하는 조건이 없을 떄 실행되는 코드}


- else - if문
if(condition1) {
 조건1이 참일 때 실행
} else if(condition2){
 조건1이 거짓이고 조건2가 참일 때 실행
} else if(condition3){
 조건2가 거짓이고 조건3가 참일 때 실행
} else if(condition4){
 조건3이 거짓이고 조건4가 참일 때 실행
} else {
 모든 조건이 거짓일 때 실행
}
else 는 생략 가능

-switch문
if문으로도 해결이 가능하지만, 더 편함
ex)
switch (grade) {
    case 1 :
         coupon = 1000;
         break;
    case 2 :
         coupon = 2000;
         break;
    case 3 :
         coupon = 3000;
         break;
    case 4 :
    case 5 :
         coupon = 4000;   -> 이 경우는 4, 5case 둘 다 이 로직이 실행됨
         break;
    default;
         coupon = 500;

반드시 break문이 있어야 함


if문은 범용적이라 다 쓸 수 있고, switch문은 단순히 숫자 혹은 문자의 값이 조건과 같은지만 판단할 때 사용할 수 있다.


- 개선된 switch문
ex)
int coupon = switch(grade) {
    case1 -> 1000;
    case2 -> 2000;
    case3 -> 3000;
    default -> 500;
};




 */


