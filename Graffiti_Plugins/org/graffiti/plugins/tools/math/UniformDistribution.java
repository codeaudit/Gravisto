package org.graffiti.plugins.tools.math;

import java.util.Random;

/**
 * @author Andreas Glei&szlig;ner
 * @version $Revision$ $Date$
 */
public class UniformDistribution implements Distribution<Double> {
    private double lowerBound;
    private double factor;

    public UniformDistribution() {
        this(0.0, 1.0);
    }

    public UniformDistribution(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.factor = upperBound - lowerBound;
    }

    public Double sample(Random random) {
        return lowerBound + factor * random.nextDouble();
    }
}
