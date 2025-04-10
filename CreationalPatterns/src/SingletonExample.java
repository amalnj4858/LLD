public class SingletonExample {

    //The instance is created before class loading. Small performance hit, what if it is not needed at the start itself.
    public static class EagerSingletonExample {

        private static final EagerSingletonExample eagerSingletonExampleInstance = new EagerSingletonExample();

        private EagerSingletonExample() {
        }

        public static EagerSingletonExample getEagerSingletonExampleInstance() {
            return eagerSingletonExampleInstance;
        }

    }


    //More performant. Loads when requested for the first time and same instance is passed on subsequent requests.
    //Made thread safe.
    public static class LazySingletonExample {

        private static LazySingletonExample lazySingletonExampleInstance;

        private LazySingletonExample() {}

        public static synchronized LazySingletonExample getLazySingletonExampleInstance() {
            if(lazySingletonExampleInstance == null) {
                lazySingletonExampleInstance = new LazySingletonExample();
            }
            return lazySingletonExampleInstance;
        }

    }

    //Making the critical section smaller for performance. Leads to having two null checks(if two threads get through the initial null check at the same time.)
    public static class OptimisedThreadSafeSingletonExample {

        private static OptimisedThreadSafeSingletonExample optimisedThreadSafeSingletonExampleInstance;

        private OptimisedThreadSafeSingletonExample(){}

        public static OptimisedThreadSafeSingletonExample getOptimisedThreadSafeSingletonExampleInstance() {
            if(optimisedThreadSafeSingletonExampleInstance == null) {
                synchronized (OptimisedThreadSafeSingletonExample.class) {
                    if(optimisedThreadSafeSingletonExampleInstance == null) {
                        optimisedThreadSafeSingletonExampleInstance = new OptimisedThreadSafeSingletonExample();
                    }
                }
            }
            return optimisedThreadSafeSingletonExampleInstance;
        }
    }


}
