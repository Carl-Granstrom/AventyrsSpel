package Main.Interfaces;

/**
 * Alla föremål som ska gå att titta på i spelet är describables. Används via Player.lookAt(Describable).
 */
public interface Describable {
    public abstract String getDescription();
}
