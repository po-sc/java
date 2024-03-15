public class Student {
    private String name;
    private double averageGrade;
    private String INN;  // добавляем поле для ИНН
    public String getINN() {
        return INN;
    }
    public Student(String name, double averageGrade, String INN) throws EmptyStringException, BadINNException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("Student name cannot be empty or null.");
        }

        if (INN == null || INN.trim().isEmpty() || !isValidINN(INN)) {
            throw new BadINNException("Invalid INN for student: " + name);
        }


        this.name = name;
        this.averageGrade = averageGrade;
        this.INN = INN;
    }

    // Добавим метод для проверки валидности ИНН
    private boolean isValidINN(String INN) {
        // Реализация проверки валидности ИНН
        // В данном примере просто возвращаем true, замените на вашу логику
        return true;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
    public String getName() {
        return name;
    }

}

