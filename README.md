# prj_adr_matdesign
Taller Android Material Design

## Indice

1. [colores](https://youtu.be/KF-OddyWamg?t=1698)
    1. [material.io - Colors](https://material.io/guidelines/style/color.html)
2. [textos](https://youtu.be/KF-OddyWamg?t=1737)
3. [colores](https://youtu.be/KF-OddyWamg?t=1890)
    1. [rec. materialpallete](https://www.materialpalette.com)
        1. devuelve colores, primarios, acentuación, texto etc...
4. [toolbar](https://youtu.be/KF-OddyWamg?t=2444)
5. [include - toolbar]()
    1. Separando el tag `android.support.v7.widget.Toolbar` a un elemento aislado **toolbar.xml**
6. [FrameLayout](https://youtu.be/KF-OddyWamg?t=4947)
7. [android.support.design.widget.FloatingActionButton](https://youtu.be/KF-OddyWamg?t=5432)
    1. Para que funcione este componente es necesario definirlo en app/build.gradle buscando la
       libreria en [https://developer.android.com/topic/libraries/support-library/packages.html](https://developer.android.com/topic/libraries/support-library/packages.html#custom-tabs)
       con la sentencia `implementation "com.android.support:design:27.1.1"`
    2. Hay que hacer el import en la actividad: **com/example/ioedu/adr_matdesign/MainActivity.java**
       así `import android.support.design.widget.FloatingActionButton;`
    3. [Entendiendo el onClick y la clase anónima](https://stackoverflow.com/questions/30552028/how-to-understand-new-class-methodsome-code-in-android)