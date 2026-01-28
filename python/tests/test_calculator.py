import pytest
from calculator import add_nums, subtract, multiply, divide

num1 = 3
num2 = 2

def test_add():
    assert add_nums(num1, num2) == 5

def test_subtract():
    assert subtract(num1, num2) == 1

@pytest.mark.activity
def test_multiply():
    assert multiply(num1, num2) == 6

@pytest.mark.activity
def test_divide():
    assert divide(num1, num2) == 1.5
