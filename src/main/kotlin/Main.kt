// 피보나치 수열 연습

fun main(args: Array<String>) {
    println("결과 값 ${solution(10)}")
}

val memo = Array<Int>(1000) { 0 }

// Top-Down 방식

fun solution(n : Int) : Int {
    return if(n <= 1) n
    else {
        memo[n] = solution(n - 1) + solution(n - 2)
//        println(memo[n])
        return memo[n]
    }
}

// Bottom Up 방식

fun fibonachi(n : Int) : Int{
    memo[0]=0;
    memo[1]=1;
    memo[2]=1;
    for (i in 2..n){
        memo[i]=memo[i-1]+memo[i-2];
    }
    return memo[n]
}