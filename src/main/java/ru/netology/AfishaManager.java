package ru.netology;

public class AfishaManager {

    private int resultSize;
    private String[] films = new String[0];

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < resultSize) {
            resultLength = films.length;
        } else {
            resultLength = resultSize;
        }
        String[] result = new String[resultLength];
        int j = 0;
        for (int i = films.length - 1; j < resultLength; i--) {
            result[j] = films[i];
            j++;
        }
        return result;
    }

    public AfishaManager() {
        this.resultSize = 10;
    }

    public AfishaManager(int resultSize) {
        this.resultSize = resultSize;
    }

}