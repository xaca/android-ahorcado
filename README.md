# Aplicación nativa android (JAVA)

En este repositorio se incluye el código de un proyecto nativo desarrollado en Java, adicionalmente se explican los pasos para crear sus principales partes y finalmente como firmar la aplicación y subirla a la tienda de aplicaciones de google.  

## Pasos para firmar la aplicación desde Android Studio

> Se recomienda haber realizado una prueba previa usando una firma en modo ddebug, en un emulador o directamente en un dispositivo, estas pruebas solo sirven para probar la aplicación, no sirven para subir la aplicación a la tienda. Para firmar la aplicación asumimos que el proyecto ya tiene al menos un APK sin firmar.

1.  Ir al menú build y seleccionar la opción Generate Signed Bundle /APK, esta opción nos ermite exportar el APK firmado de nuestra app, y si no tenemos creada una clave para firmar la aplicación por acá lo podemos hacer  

    ![Instrucciones de publicación android](https://i.imgur.com/hnu2wk7.png)

2.  Seleccionamos la opción APK y le damos siguiente  

    ![Instrucciones de publicación android](https://i.imgur.com/BzGs5JJ.png)

3.  En la siguiente pantalla vemos una serie de opciones que deben ser diligenciadas, muy importante guardar los passwords en un lugar seguro, fuera del proyecto, ya que siempre vamos a necesitar esta información para firmar la aplicación  
    
    ![Instrucciones de publicación android](https://i.imgur.com/ogLxIuu.png)


4.  **Ruta donde se guardará el almacen de claves** Esta es una ubicación donde se guardan de manera segura las claves en el computador, puede ser asignada por el usuario.   
**clave del almacen** Clave para acceder al almacen  
**Nombre de la llave** Es un alias o apodo que se le da a la llave, puede ser cualquier valor, ojala sin espacios y sin caracteres especiales  
**Clave de la llave** Clave de la llave, se pedirá más adelante  
**Datos de quien publica** Estos datos son los de la empresa o la persona que publica la aplicación     
    
    ![Instrucciones de publicación android](https://i.imgur.com/YflS7qt.png)

5.  Datos para configurar la firma de la aplicación, si no se han creado se deben llenar, recuerde guardar esta información en un lugar diferente al repositorio del proyecto   

    ![Instrucciones de publicación android](https://i.imgur.com/MIFVEwV.png)

6.  **Ruta del almacen de llaves** Es la ruta donde se guardo el almacen creado en el paso anterior
    **Clave del almacen** Clave del almacen, primero se debe ingrear al almacen para usar la llave
    **Clave de la llave** Clave de la llave con la cual se firmará la aplicación

    > Se pueden dejar las llaves guardadas para firmar más rápido la aplicación,   
    > sin embargo la recomendación siempre es poner la llave.    

    ![Instrucciones de publicación android](https://i.imgur.com/7us1EG0.png)

7.  **Ruta del proyecto** Es la ruta actual del proyecto, esto se asigna por defecto   
    
    > Build Variants, es una sección en el IDE de android, que permite configurar si la aplicación va a ser firmada para:
    > debug: es para hacer pruebas en el emulador o para release: es para subir a la tienda de aplicaciones.  
    > Luego se deben seleccionar las dos tipos de firmas V1 y V2  

    ![Instrucciones de publicación android](https://i.imgur.com/PE6MjlC.png)

8.  Al finalizar el proceso, se empieza a construir el archivo APK firmado  

    ![Instrucciones de publicación android](https://i.imgur.com/CJvpYW8.png)

9.  Al terminar el proceso la APK queda creada y firmada, lista para su publicación, en la opción locate se puede abrir directamente el archivo donde queda almacenada.  

    ![Instrucciones de publicación android](https://i.imgur.com/jc9w4F8.png)

10. La aplicación firmada queda en la carpeta realease de los archivos del proyecto  

    ![Instrucciones de publicación android](https://i.imgur.com/juTL0s9.png)

## Firmar la aplicación con una llave previamente creada

    Una vez configurada la llave, las próximas veces que se quiera firmar la aplicación  
    Solo se deben seguir unos pasos mínimos, recuerde que si ya subió una vez la aplicación  
    a la tienda, debe cear una nueva versión con la misma firma. 

1. Seleccionamos la opción para generar el APK firmado  

    ![Instrucciones de publicación android](https://i.imgur.com/fKavzmf.png)

2. Por defecto sale seleccionada la opción APK  

    ![Instrucciones de publicación android](https://i.imgur.com/J2ebdjZ.png)

3. Se ingresan las claves del almacen de llaves y de la llave  

    ![Instrucciones de publicación android](https://i.imgur.com/dcRA9Zp.png)

4. Se selecciona la opción de firma para realse y se seleccionan las dos opciones de firma  

    ![Instrucciones de publicación android](https://i.imgur.com/xoBGl1o.png)

5. En este paso ya quedo firmada la aplicación (Pendiente la explicación de como subir en la tienda)  

    ![Instrucciones de publicación android](https://i.imgur.com/4UoFuZJ.png)

## Referencias

* [Icon Archive, de este sitio use algunas imágenes para las categorias del juego](http://www.iconarchive.com/)  
* [Iconos vectoriales para el logo y para la sección score](https://thenounproject.com/)  
* [Instrucciones de android](https://developer.android.com/studio/publish/app-signing)  
* [¿Cómo usar la firma?](https://support.google.com/googleplay/android-developer/answer/7384423)  
* [Google developer console](https://developer.android.com/)  
* [Aplicación publicada](https://play.google.com/store/apps/details?id=com.xacarana.ahorcado)  