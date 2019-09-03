## Dorogovtsev-Mendes Generator

#### 도로고프세프-멘데스 그래프 생성기로 그래프 생성.
###### 이 생성기는 Dorogovtsev 및 Mendes 알고리즘을 사용하여 그래프를 작성한다.
###### 먼저 세 개의 Node와 트리 가장자리를 만들고 삼각형을 만든 다음 한 번에 하나의 Node를 추가한다.
###### 그리고 Node가 추가 될 때마다 Edge가 Random하게 선택되고 Node는 두 개의 새로운 Edge를 통해 선택한 Edge의 두 말단에 연결된다.

###### 이 프로세스는 더 많은 Edge를 가진 Node가 Edge Set에서 더 많이 표현되기 때문에 
###### 더 많은 Edge를 가진 Node를 선택할 가능성이 높다. 따라서 그래프가 저전력으로 분포되며 생성된다.

###### 마지막으로 Dorogovtsev-Mendes 알고리즘은 항상 평면 그래프를 생성한다.
![캡처](https://user-images.githubusercontent.com/40822689/64183523-fa407f00-cea4-11e9-801d-71840951e730.PNG)
