## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
## 연료 주입
### 기능 요구사항
1. 보유 차량 Sonata 2대, Avante 1대, K5 2대 총 5대
2. 차량 연비
    1. Sonata : 10km/리터
    2. Avante : 15km/리터
    3. K5 : 13km/리터
3. 차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서 생성
---
### 프로그래밍 요구사항
1. 상속과 추상 메소드를 활용
2. if/else를 사용하지 않고 구현
3. 생성자의 인자 값은 여행할 거리를 의미

### 기능 분리
1. 차량 연비 계산
2. 리포트 출력
---
## 좌표계산기(선길이)
### 기능 요구사항
1. 점에 대한 좌표 정보를 입력
2. 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
3. X, Y좌표 모두 최대 24까지만 입력할 수 있다.
4. 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
5. 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
6. 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
7. 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.
---
### 프로그래밍 요구사항
1. 메소드의 길이가 10라인을 넘어가지 않도록 구현한다.
2. UI 로직을 InputView, ResultView와 같은 클래스를 추가하여 분리한다.
