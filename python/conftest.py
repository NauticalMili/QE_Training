"""import pytest

@pytest.fixture
def number_list():
    return list(range(11))  # 0 through 10
"""

import pytest

@pytest.fixture
def wallet():
    return {"amount": 0}
