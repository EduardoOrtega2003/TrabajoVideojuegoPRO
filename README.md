# TrabajoVideojuegoPRO_UT06            

# 🎮 Sistema de Personajes RPG en Java (MVC)

src/
├── Interfaces/
│   ├── Curable.java
│   ├── Volador.java
│   ├── Magico.java
│   ├── Defendible.java
│   └── Movilizable.java
├── Controlador/
│   └── ControlJuego.java
├── App/
│   └── Main.java
├── Modelo/
│   ├── Personaje.java
│   ├── PersonajeFisico.java
│   ├── PersonajeMagico.java
│   ├── Guerrero.java
│   ├── Mago.java
│   ├── Arquero.java
│   ├── Hechicero.java
│   └── Asesino.java
└── Vista/
    └── VistaJuego.java

Este proyecto implementa un sistema de personajes para un videojuego de rol. El sistema permite crear personajes con habilidades distintas, simular acciones y realizar batallas uno contra uno entre ellos.

## 🧱 Estructura del Proyecto

- **modelo/** → Contiene las clases abstractas y concretas de personajes (guerreros, magos, arqueros, etc.).
- **interfaces/** → Define las habilidades especiales como `Curable`, `Defendible`, `Volador`, etc.
- **vista/** → Encargada de mostrar acciones y simular batallas entre personajes.
- **controlador/** → Controlador principal que gestiona la lógica del juego.
- **main/** → Clase de entrada al programa (`Main.java`).

## 🧙 Personajes disponibles

Cada personaje pertenece a una subclase concreta y puede tener habilidades como curarse, defenderse, moverse o lanzar hechizos.

- **Guerrero**
- **Mago**
- **Arquero**
- **Hechicero**
- **Asesino**

## ⚔️ Funcionalidades

- Crear y gestionar personajes personalizados.
- Mostrar habilidades disponibles por personaje.
- Simular una batalla 1v1 entre dos personajes seleccionados.
- Separación clara entre modelo, vista y controlador (MVC).

## 📝 Ejemplo de salida esperada

```
Thor ataca cuerpo a cuerpo con fuerza 80
Merlín lanza un hechizo con sabiduría 90
...
--- COMIENZA LA BATALLA ---
Thor (Nivel: 10, Salud: 150) VS Morgana (Nivel: 14, Salud: 110)
...
Thor ha ganado la batalla.
```

## Menú del juego

![image](https://github.com/user-attachments/assets/2ba66104-bc29-43e8-be95-44b7439fbfcd)

## Información de los personajes

![image](https://github.com/user-attachments/assets/bf786048-1b00-44f7-9e84-9c981b95399e)

## Batalla 1vs1

![image](https://github.com/user-attachments/assets/ca5b4b48-4906-4d16-99f0-5d987e984600)

Fin de la batalla 

![image](https://github.com/user-attachments/assets/7465e530-2a47-480b-843c-c5d55087581b)


## 👤 Autores

- Proyecto desarrollado por Kevin, Yanira, Eduardo.

