# Aplicación nativa android (JAVA)

En este repositorio se incluye el código de un proyecto nativo desarrollado en Java, adicionalmente se explican los pasos para crear sus principales partes y finalmente como firmar la aplicación y subirla a la tienda de aplicaciones de google.  

## Pasos para firmar la aplicación desde Android Studio

> Se recomienda haber realizado una prueba previa usando una firma en modo ddebug, en un emulador o directamente en un dispositivo, estas pruebas solo sirven para probar la aplicación, no sirven para subir la aplicación a la tienda. Para firmar la aplicación asumimos que el proyecto ya tiene al menos un APK sin firmar.

1.  Ir al menú build y seleccionar la opción Generate Signed Bundle /APK, esta opción nos ermite exportar el APK firmado de nuestra app, y si no tenemos creada una clave para firmar la aplicación por acá lo podemos hacer.
    [Imgur](https://i.imgur.com/hnu2wk7.png)

2.  Seleccionamos la opción APK y le damos siguiente.
    [Imgur](https://i.imgur.com/BzGs5JJ.png)

3.  En la siguiente pantalla vemos una serie de opciones que deben ser diligenciadas, muy importante guardar los passwords en un lugar seguro, fuera del proyecto, ya que siempre vamos a necesitar esta información para firmar la aplicación
    [Imgur](https://i.imgur.com/ogLxIuu.png)


4.  **Ruta donde se guardará el almacen de claves** Esta es una ubicación donde se guardan de manera segura las claves en el computador  
**clave del almacen** Clave para acceder al almacen
**Nombre de la llave** Es un alias o apodo que se le da a la llave, puede ser cualquier valor, ojala sin espacios y sin caracteres especiales.
**Clave de la llave** Clave de la llave, se pedirá más adelante.
**datos de quien publica** Estos datos son los de la empresa o la persona que publica la aplicación
    [Imgur](https://i.imgur.com/YflS7qt.png)

5.  Datos para configurar la firma de la aplicación, si no se han creado se deben llenar, recuerde guardar esta información en un lugar diferente al repositorio del proyecto
    [Imgur](https://i.imgur.com/MIFVEwV.png)
    
6.  [Imgur](https://i.imgur.com/7us1EG0.png)
7.  [Imgur](https://i.imgur.com/PE6MjlC.png)
8.  [Imgur](https://i.imgur.com/CJvpYW8.png)
9.  [Imgur](https://i.imgur.com/jc9w4F8.png)
10. [Imgur](https://i.imgur.com/juTL0s9.png)
11. [Imgur](https://i.imgur.com/fKavzmf.png) 
12. [Imgur](https://i.imgur.com/J2ebdjZ.png)
13. [Imgur](https://i.imgur.com/dcRA9Zp.png)
14. [Imgur](https://i.imgur.com/xoBGl1o.png)
15. [Imgur](https://i.imgur.com/4UoFuZJ.png)

## Referencias