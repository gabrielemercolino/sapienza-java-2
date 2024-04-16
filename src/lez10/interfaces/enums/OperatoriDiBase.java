package lez10.interfaces.enums;

import java.util.function.BiFunction;

public enum OperatoriDiBase implements BiFunction<Double, Double, Double> {
  SOMMA {
    @Override
    public Double apply(Double a, Double b) {
      return a + b;
    }
  },

  SOTTRAZIONE {
    @Override
    public Double apply(Double a, Double b) {
      return a - b;
    }
  },

  PRODOTTO {
    @Override
    public Double apply(Double a, Double b) {
      return a * b;
    }
  },

  DIVISIONE {
    @Override
    public Double apply(Double a, Double b) {
      return a / b;
    }
  }
}
