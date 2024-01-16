#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct {
    int* elements;
    int size;
    int capacity;
} RandomizedSet;

RandomizedSet* randomizedSetCreate() {
    RandomizedSet* set = (RandomizedSet*)malloc(sizeof(RandomizedSet));
    set->elements = NULL;
    set->size = 0;
    set->capacity = 0;
    return set;
}

bool randomizedSetInsert(RandomizedSet* obj, int val) {
    // Check if the element already exists
    for (int i = 0; i < obj->size; i++) {
        if (obj->elements[i] == val) {
            return false; // Element already exists, insertion failed
        }
    }

    // Resize the array if necessary
    if (obj->size == obj->capacity) {
        obj->capacity = (obj->capacity == 0) ? 1 : obj->capacity * 2;
        obj->elements = (int*)realloc(obj->elements, obj->capacity * sizeof(int));
    }

    // Insert the element at the end
    obj->elements[obj->size++] = val;
    return true;
}

bool randomizedSetRemove(RandomizedSet* obj, int val) {
    // Find the index of the element
    int index = -1;
    for (int i = 0; i < obj->size; i++) {
        if (obj->elements[i] == val) {
            index = i;
            break;
        }
    }

    // If the element is not found
    if (index == -1) {
        return false;
    }

    // Remove the element by replacing it with the last element
    obj->elements[index] = obj->elements[obj->size - 1];
    obj->size--;

    return true;
}

int randomizedSetGetRandom(RandomizedSet* obj) {
    // Generate a random index within the current size
    int randomIndex = rand() % obj->size;
    return obj->elements[randomIndex];
}

void randomizedSetFree(RandomizedSet* obj) {
    free(obj->elements);
    free(obj);
}

