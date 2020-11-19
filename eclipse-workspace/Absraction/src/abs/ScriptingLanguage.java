package abs;

public interface ScriptingLanguage {
	
	public static final boolean FLEXIBLE = true;
	
	public abstract void code();
	public abstract void compile();
	public abstract void execute();
	
//	public static void help() {
//		System.out.println("print some documentation");
//	}
//	
//	public default void interpreter() {
//		System.out.println("avbsd");
//	}
}
