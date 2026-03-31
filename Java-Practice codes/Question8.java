interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image");
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to data");
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

public class Question8 {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("Blur");
        img.reset_filter();

        data.apply_filter("Noise Reduction");
        data.reset_filter();
    }
}