package com.example.layer;

import com.example.layer.application.OrderSaver;
import com.example.layer.application.OrderUpdater;
import com.example.layer.model.SavedOrder;
import com.example.layer.model.UpdatedUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public final class OrderController {

    private final OrderSaver saver;
    private final OrderUpdater updater;

    @GetMapping
    public String create() {
        SavedOrder result = saver.save();

        return result.toString();
    }

    @GetMapping("/{id}")
    public String create(@PathVariable Long id) {
        UpdatedUser result = updater.update(id);

        return result.toString();
    }
}
