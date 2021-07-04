# ActionBarAPI

### ActionBarAPI for Spigot Plugins (   스피곳 플러그인을 위한 액션바 API 라이브러리입니다.   )



## Usages

***
* import ( 임포트 )

  ```java
  import com.bookit.ActionBarAPI.ActionBarAPI;
  ```

* Apped text to HashMap ( 해쉬맵에 텍스트 추가 )

  ```java
  ActionBarAPI.addText(String name, String key, String text)
  ActionBarAPI.addText(Player player, String key, String text)
  ```

* Remove text from HashMap (  해쉬맵에서 텍스트 제거 )

  ```java
  ActionBarAPI.removeText(String name, String key)
  ActionBarAPI.removeText(Player player, String key)
  ```

* Send ActionBar to Player ( 플레이어에게 액션바 출력 )

  ```java
  ActionBarAPI.sendActionBar(Player player)
  ```
