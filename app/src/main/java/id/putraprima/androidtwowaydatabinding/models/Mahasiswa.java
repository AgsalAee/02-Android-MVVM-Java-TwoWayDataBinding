package id.putraprima.androidtwowaydatabinding.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import id.putraprima.androidtwowaydatabinding.BR;

public class Mahasiswa extends BaseObservable {
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    @Bindable
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        notifyPropertyChanged(BR.nama);
    }
}
