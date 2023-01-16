package cucerdariancatalin.menunavigation.state

sealed class ScreenState<out T> {
    class Render<T>(val renderState: T) : ScreenState<T>()
}