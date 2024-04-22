package solid._4_interfaceSegregation;

/**
 * <a href="https://nuancesprog.ru/p/18651/">Принципы SOLID</a>
 * <p><b>Принцип разделения интерфейса</b></p>
 *
 * Согласно этому принципу, в классе не обязательно должны использоваться методы, для которых они не предназначены или
 * где их применение не ожидается.
 * <p>
 * Этот принцип нарушается, если в классе содержатся ненужные его подклассу методы или их практическое применение
 * лишено смысла.
 * <p>
 * Подклассом Duck от родительских классов SwimmingAnimal, FlyingAnimal и VocalAnimal наследуются абстрактные методы.
 * Внутри унаследованных методов объекта Duck ими явно определяются поведения, свойственные уткам.
 * <p>
 * Та же логика применяется и к классу Dog, но класс VocalAnimal здесь наследуется вместе со встроенным методом make_sound.
 * <p>
 * Так разделяются уникальные поведения животных: применяются интерфейсы поменьше, где каждый класс зависит только
 * от интерфейсов, в которых содержится его поведенческий атрибут. Таким образом, уткой наследуются все три интерфейса,
 * собакой  —  только VocalAnimal
 */
public class Main {
    public static void main(String[] args) {

    }
}
