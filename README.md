# DynamicProgrammingFibonachi

## 코딩테스트 연습 겸 DynamicProgramming 에 대한 설명입니다. 


### DynamicProgramming
다이나믹 프로그래밍은 복잡한 문제를 작은 단위로 나누어 푸는 최적화 기법 중 하나입니다.

그래서 그 작은 단위들로 풀며

예시는 아래와 같습니다.

  ```kotlin
      fun fibonacci(n: Int, memo: IntArray): Int {
        if (n <= 1) return n
        if (memo[n] != 0) return memo[n]
        memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo)
        return memo[n]
    }
    
    fun main() {
        val n = 10
        val memo = IntArray(n+1)
        val result = fibonacci(n, memo)
        println(" ${n}번째 피보나치 수는 ${result}")
    }
  ```

* 다이나믹 프로그래밍의 대표적인 방식 3가지는

  * Memorization : 이전 값을 저장하고,  이후 같은 계산 시 불 필요한 계산을 생략하는 방법 (위의 예시 코드)

  * Bottum-Up : 작은 문제부터 차례대로 해결해나가는 방법입니다. 일반적으로 반복문으로 구현됩니다.
  ```kotlin
    fun fibonacci(n: Int): Int {
      val memo = IntArray(n+1)
      memo[0] = 0
      memo[1] = 1

      for (i in 2..n) {
          memo[i] = memo[i-1] + memo[i-2]
      }

      return memo[n]
  }

  fun main() {
      val n = 10
      val result = fibonacci(n)
      println(" ${n}번째 피보나치 수는 ${result}")
  } 
  ```

  * Top-Down : 문제를 작은 문제로 나누어 해결하는 방법입니다. 일반적으로 재귀적으로 구현된 코드에서 사용됩니다.
    ```kotlin
   fun fibonacci(n: Int, memo: IntArray): Int {
      if (n <= 1) return n
      if (memo[n] != 0) return memo[n]

      memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo)
      return memo[n]
  }

  fun main() {
      val n = 10
      val memo = IntArray(n+1)

      val result = fibonacci(n, memo)

      println(" ${n}번째 피보나치 수는 ${result}")
  } 
  ```
Memorization, Bottum-Up, Top-Down 등의 방법을 사용하여 해결할 수 있습니다.

앞으로 최장 공통부분 문자열과 최장 증가부분 수열을 올리도록 하겠습니다.

다만 다이나믹 프로그래밍은 일정 부분 패턴이 없을 때 억지로 만들면 괜히 시간복잡도가 증가하여 

패턴이 있을 경우에 사용하는 것을 추천드립니다.

