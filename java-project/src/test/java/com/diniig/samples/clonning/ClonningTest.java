package com.diniig.samples.clonning;

import org.junit.jupiter.api.Test;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClonningTest {

    @Test
    public void shouldAnswerWithTrue() {
        log.info("hello world");
    }

        @Test
    public void deepAndShallowCopy() {
        List<Name> names = List.of(new Name("world"));

        ShallowCopySample original = new ShallowCopySample(1, "hello1", names);
        ShallowCopySample copy = original.clone();

        DeepCopySample original2 = new DeepCopySample(1, "hello2", names);
        DeepCopySample copy2 = original2.clone();
    }
}