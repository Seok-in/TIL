# Input/OutPut
### 1. Scanner / System.out.println()
- Scanner 는 키 입력을 공백단위로 구분하여 읽는다.
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String name = scanner.next();
int age = scanner.nextInt();

System.out.println("입력받은 값" + name + age);
```
- Scanner를 통한 EOF 처리 : hasNext()는 입력값이 있으면 true,없으면 false
```java
Scanner sc = new Scanner(System.in);

while(scan.hasNext()){
    System.out.println(scan.nextLine());
}
```

### 2.BufferedReader / BufferedWriter / StringTokenizer
- BufferedReader 는 Scanner에 비해 많은양의 데이터를 입력받을경우 효율적이다.(속도)
- BufferedReader 는 Scanner와 달리 IOException처리를 해주어야 한다.
- BufferedReader는 라인단위로 입력을 받으며, String 타입이다.
```java
import java.io.*;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
int i = Integer.parseInt(br.readline());

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
String s = "출력할 문자열";
bw.write(s);//출력
bw.newLine();//줄바꿈
bw.flush();//남아있는 데이터 모두 출력
bw.close();//스트림을 닫음
```
- BufferedReader EOF 처리
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String input = "";
while((input = br.readLine()) != null){
    //readLine으로 읽은 값이 null이 되면 반복문을 종료
}
```
- StringTokenizer : StringTokenizer는 readline으로 한번에 받은 것을 나눠주는 역할을 한다.
```java
import java.util.*;
StringTokenizer st = new StringTokenizer(br.readLine()," ");

int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
### 3. 아스키코드 입출력
```java
int a = System.in.read();
System.out.print(a);

Scanner sc = new Scanner(System.in);
String a = sc.next();
System.out.print(a.charAt(0)+0);
```