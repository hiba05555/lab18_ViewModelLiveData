# Lab 18 — ViewModel + LiveData Android

## Présentation

Application Android démontrant la persistance des données lors des rotations d'écran grâce à ViewModel et LiveData (architecture MVVM Jetpack).

---

## Ce qui a été réalisé

### Fonctionnalités
| Fonctionnalité | Description |
|---|---|
| ViewModel | Survie aux rotations d'écran |
| LiveData | Mise à jour automatique de l'UI |
| MutableLiveData | Compteur modifiable depuis le ViewModel |
| postValue() | Incrémentation depuis un thread background |
| Observer | Observation lifecycle-aware |

### Personnalisation HC
- ViewModel : `CounterViewModel`
- LiveData : `hcCountLiveData`, `hcStatusLiveData`
- Méthodes : `hcIncrement()`, `hcDecrement()`, `hcReset()`
- Palette : rose foncé / cyan

---

## Démonstration


https://github.com/user-attachments/assets/0603f18a-606d-4da7-887e-c5a357322616



---

## Technologies utilisées
- Android Studio
- Java
- ViewModel
- LiveData
- MutableLiveData
- ViewModelProvider
- MaterialComponents
