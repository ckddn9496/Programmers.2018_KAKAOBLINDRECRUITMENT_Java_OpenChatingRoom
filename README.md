# Programmers.2018_KAKAOBLINDRECRUITMENT_Java_OpenChatingRoom (오픈채팅방)

## 1. 문제설명
오픈 채팅방에 들어가고 나가는 것을 볼수있도록 Logger를 만드는것. String[] 로 ``` [Enter/Leave/Change] uid name ```형식의 record들이 입력으로 들어오면 이를 분석하여 ```OOO님이 들어왔습니다.``` 형식의 로그를 String[]으로 return하는 문제. Change는 사용자의 이름(name)을 수정하는데 최종 출력되는 log에는 마지막으로 사용한 이름으로 출력되어야 한다.

## 2. 풀이방법
Enter와 Leave에 대한 log를 만들어야 하므로 들어가고 나간 행위와 어느 uid를 가진 유저의 행동인지 알기위해 record를 저장할 자료구조 생성(ArrayList).

사용자의 고유 uid와 그 사용자의 최신 닉네임을 알기 위해 <uid, name> 쌍을 저장(HashMap).

저장된 record의 길이만큼 출력하여 해당record의 uid과 맞는 쌍의 name을 Hashmap에서 찾아 log를 완성시켰다.

## 3. 어려웠던점
처음에는 User class, Record class, Log class를 만들어 객체 지향적으로 만들었지만, 수행시간이 오래 걸려서 실패하였다. 코딩테스트인 만큼 적은 자원으로 빠르게 수행될 수 있는 코드를 작성하는 연습을 해야겠다.
