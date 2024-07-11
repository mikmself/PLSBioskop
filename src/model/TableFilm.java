package model;

import entity.FilmEntity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableFilm extends AbstractTableModel {

    private List<FilmEntity> list = new ArrayList<>();

    public void add(FilmEntity film) {
        list.add(film);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }

    public FilmEntity get(int index) {
        return list.get(index);
    }

    public FilmEntity set(int index, FilmEntity film) {
        FilmEntity oldFilm = list.set(index, film);
        fireTableCellUpdated(index, index);
        return oldFilm;
    }

    public FilmEntity remove(int index) {
        FilmEntity removedFilm = list.remove(index);
        fireTableRowsDeleted(index, index);
        return removedFilm;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "NAMA FILM";
            case 2:
                return "COVER";
            case 3:
                return "GENRE";
            case 4:
                return "NAMA SUTRADARA";
            case 5:
                return "NAMA PEMAIN";
            case 6:
                return "TAHUN";
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FilmEntity film = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return film.getId_film();
            case 1:
                return film.getNama_film();
            case 2:
                return film.getCover();
            case 3:
                return film.getGenre();
            case 4:
                return film.getNama_sutrada();
            case 5:
                return film.getNama_pemain();
            case 6:
                return film.getTahun();
            default:
                return null;
        }
    }
}
