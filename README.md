# 재료 관리 App 프로젝트 V2
> **개발기간 : 2023.01.13 ~** <br>
> [Ingredient V1 (MVC)](https://github.com/dogdduddy/ingredient)


## Index
- [Introduce](#Introduce)
- [Environment & Library](#Environment--Library)
- [Feat](#Feat)
- [Document](#Document)
- [Challenge](#Challenge)
- [Future](#Future)


## Introduce
보관 재료의 유통기한을 알려주고, 음식 검색을 도와줍니다.
<p align="left"><img src="https://user-images.githubusercontent.com/32217176/215462374-a27478d8-0e09-4ffe-9dff-6ced7c5f83e4.png" width="550" height="350"></p>


## Environment & Library
- min SDK : 24
- target SDK : 33
- Kotlin : 1.7.21
- Android Studio : Electric Eel 22.1.1


| **Purpose**      | **Library**                                                     |
|:-----------------|:----------------------------------------------------------------|
| Async Task       | Coroutine, Flow, LiveData                                       |
| DI               | Hilt                                                            |
| Local Database   | Room                                                            |
| Server Database  | Firebase FireStore, Firebase Auth, Firebase Storage             |
| Server           | Firebase Functions                                              |
| Presentation     | Material Design2(Chip), Jetpack Navigation, ViewPager2, Glide,  |


## Feat
### 소셜 로그인
<img src="https://user-images.githubusercontent.com/32217176/215421070-a78a15e8-a0db-4d1b-b45f-a825e3341c68.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215421350-c4be9ed5-4ee9-4527-b066-9f600d009a36.jpeg" width="30%;display:inline">

### 음식 추천 및 검색
<img src="https://user-images.githubusercontent.com/32217176/215421866-6374d129-21e2-4c59-bfcf-e337cbe8391a.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215421874-802d820b-469c-4073-ac49-2323bdc4c5db.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215421877-457620be-5209-42c3-9298-e24bc231c01a.jpeg" width="30%" style="margin-right: 7px">

### 유통기한 관리
<img src="https://user-images.githubusercontent.com/32217176/215422401-397662f8-32bb-499f-b419-e146c0d4076c.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215422408-0cab43ed-2047-4efa-af18-48153743147f.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215422411-999e87ed-5143-4baf-8eeb-b65f92ed3b00.jpeg" width="30%" style="margin-right: 7px">

### 장바구니
<img src="https://user-images.githubusercontent.com/32217176/215422979-76734b2d-937a-49ab-afbb-f2f42795a333.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215422983-1bdc994d-5b98-460c-a18d-e98c3063b443.jpeg" width="30%" style="margin-right: 7px"> <img src="https://user-images.githubusercontent.com/32217176/215422986-85f8aaa4-1c3a-4b05-bf4b-5dc171ab54db.jpeg" width="30%" style="margin-right: 7px">

### 그 외
- 유통기한 일수 차감


## Document
- [\[노션\] V2 개발 일지 정리](https://www.notion.so/dogdduddy/02b6b08163a145a5a18e196f3916d5b2?v=539d2e433bbd40d18046be92310a2ea6)
- [\[노션\] 개인 공부&취미](https://www.notion.so/dogdduddy/3d47c0b785ca454d94e7cba8a6589632)


## Challenge
### 관심사 분리 및 모듈화
> Spring으로의 이전 작업과 IOS와 같은 플랫폼 확장을 위해 Domain/Presentation/Data, signin을 포함하여 기능별, 레이어별로 모듈화해주었습니다. 
> 관심사는 Domain으로 몰리고, 데이터 흐름은 단방향으로 흐르도록 Hilt와 Flow를 사용했습니다. 


## Future
### 데이터베이스의 및 서버의 구현
> Firebase의 FireStore는 쿼리를 위한 처리 과정과 많은 데이터를 불러들일 때의 속도가 저하된다는 단점이 있습니다. 속도 향상을 위해 데이터의 중복은 불가피한 상황입니다.
> 그래서 Spring을 직접 구현하여 NoSQL을 벗어나도록 구현할 예정입니다. 유통기한 일수 차감을 위해 구현한 Firebase의 Functions도 서버로 구현할 예정입니다. 

### Compose 및 애니메이션 적용
> 관심사를 분리하고 모듈화를 진행하는 이유 중 하나는 테스트 용이성 때문입니다. 
> 그래서 MVVM을 구현하기 위해 Data Binding이 아닌 **MVVM + Compose를 + AAC viewModel + LiveData or StateFlow**로 구현할 예정입니다.
> 현재는 애니메이션이 적용되지 않아 어색한 동작을 보여주고 있습니다. Drawer나 SearchBar 클릭 효과, Splash 등을 구현하여 자연스러운 동작이 되도록 구현할 것입니다.

### 배포
> 아직은 테스트 이미지, 테스트 데이터로 구 동하고 있습니다. 그래서 눈에 보이는 작은 에러들만 처리해왔습니다.
> 배포 과정에서, 유지보수 과정에서 배울수 있는 것들이 아직 많이 남아있다고 생각해서 배포를 통해 학습을 해봐야겠다고 생각했습니다.

### [Ingredient V1 (MVC)](https://github.com/dogdduddy/ingredient)
