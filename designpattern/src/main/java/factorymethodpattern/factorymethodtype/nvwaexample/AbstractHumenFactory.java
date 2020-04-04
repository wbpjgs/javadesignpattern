package factorymethodpattern.factorymethodtype.nvwaexample;

/**
 * USER:wbpjgs
 * TOTO:AbstractHumenFactory
 * CLASSNAME: AbstractHumenFactory
 * DATE: 2020/4/4
 * TIME: 16:44
 * VERSION:1.0.0
 * JDK 1.8
 */
public abstract class AbstractHumenFactory {
    public abstract <T extends Humen> T createHumen(Class<T> c);
}
