package lez9;

public class Nastro implements SupportoRiscrivibile{

  @Override
  public void leggi() {
    attivaTestina();
    muoviTestina();
  }

  @Override
  public void scrivi() {
    attivaTestina();
    caricaTestina();
    muoviTestina();
    scaricaTestina();
  }

  public void attivaTestina(){}
  public void caricaTestina(){}
  public void scaricaTestina(){}
  public void muoviTestina(){}
}
