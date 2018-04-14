# prj_adr_matdesign
[Taller Android Material Design - video Anahi Salgado](https://youtu.be/KF-OddyWamg)

- Material design está vigente a partir de la versión **lolipop**
- Para versiones anteriores se necesita descargar una libreria de soporte tipo <br/>
  como.android.support:appcompat-v7:23.1.1
  Si necesitara en algún momento trabajar con un recycler view deberia incluir un nuevo implements
  con esta libreria.
  
## Indice
1. [colores](https://youtu.be/KF-OddyWamg?t=1698)
    1. [material.io - Colors](https://material.io/guidelines/style/color.html)
2. [textos](https://youtu.be/KF-OddyWamg?t=1737)
3. [colores](https://youtu.be/KF-OddyWamg?t=1890)
    1. [rec. materialpallete](https://www.materialpalette.com)
        1. devuelve colores, primarios, acentuación, texto etc...
4. [toolbar](https://youtu.be/KF-OddyWamg?t=2444)
5. [configurar **colors.xml** con Primary,PrimaryDark y Accent](https://youtu.be/KF-OddyWamg?t=3263)
6. [NoActionBar en **styles.xml**](https://youtu.be/KF-OddyWamg?t=3433)
7. [configurar build.gradle - app con *implements*](https://youtu.be/KF-OddyWamg?t=3536)
8. [profundidad de los elementos - android.elevation](https://youtu.be/KF-OddyWamg?t=3877)
9. [crando el archivo dimen.xml](https://youtu.be/KF-OddyWamg?t=3911)
10. [include - toolbar](https://youtu.be/KF-OddyWamg?t=4134)
    1. Separando el tag `android.support.v7.widget.Toolbar` a un elemento aislado **toolbar.xml**
11. [FrameLayout](https://youtu.be/KF-OddyWamg?t=4947)
12. [android.support.design.widget.FloatingActionButton](https://youtu.be/KF-OddyWamg?t=5432)
    1. Para que funcione este componente es necesario definirlo en app/build.gradle buscando la
       libreria en [https://developer.android.com/topic/libraries/support-library/packages.html](https://developer.android.com/topic/libraries/support-library/packages.html#custom-tabs)
       <br/> con la sentencia `implementation "com.android.support:design:27.1.1"`
    2. Hay que hacer el import en la actividad: **com/example/ioedu/adr_matdesign/MainActivity.java**
       así `import android.support.design.widget.FloatingActionButton;`
    3. [Entendiendo el onClick y la clase anónima](https://stackoverflow.com/questions/30552028/how-to-understand-new-class-methodsome-code-in-android)