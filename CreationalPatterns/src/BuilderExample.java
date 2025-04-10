public class BuilderExample {
    private final String protocol;
    private final String domain;
    private final String extension;
    private final String uid;
    private final String name;

    private BuilderExample(UrlBuilder urlBuilder) {
        this.protocol = urlBuilder.protocol;
        this.domain = urlBuilder.domain;
        this.extension = urlBuilder.extension;
        this.uid = urlBuilder.uid;
        this.name = urlBuilder.name;
    }

    public void printUrl() {
        System.out.println(protocol + "//" + domain + "." + extension + "?uid=" + uid + "&name=" + name);
    }

    public static class UrlBuilder {
        private String protocol;
        private String domain;
        private String extension;
        private String uid;
        private String name;

        private UrlBuilder() {}

        public UrlBuilder(String protocol, String domain, String extension) {
            this.protocol = protocol;
            this.domain = domain;
            this.extension = extension;
        }

        public UrlBuilder setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public UrlBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderExample buildUrl() {
            return new BuilderExample(this);
        }
    }
}
