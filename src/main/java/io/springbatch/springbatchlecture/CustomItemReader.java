package io.springbatch.springbatchlecture;

import lombok.AllArgsConstructor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.List;

@AllArgsConstructor
public class CustomItemReader implements ItemReader<Customer> {

    private List<Customer> list;

    @Override
    public Customer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (!list.isEmpty()) {
            return list.remove(0);
        }

        return null;
    }

}
