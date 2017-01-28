INSERT INTO user_roles (role, username)
VALUES ('ROLE_ADMIN', 'admin');

INSERT INTO users (username, password, email, enabled)
VALUES ('admin', 'admin', 'admin@shop.com', true);

INSERT INTO categories (name, description)
VALUES ('Smartphones', 'Best Smartphones ever!!!');

INSERT INTO categories (name, description)
VALUES ('Headphones', 'Best headphones ever!!!');

INSERT INTO products (name, description, price, category_id)
VALUES ('iPhone', 'iPhone 5, old but still good', '350', 1);

INSERT INTO products (name, description, price, category_id)
VALUES ('Nokia', 'Nokia 3310 needs no introduction', '70', 1);

INSERT INTO products (name, description, price, category_id)
VALUES ('Beats', 'Just google "Beats"', '770', 2);

INSERT INTO products (name, description, price, category_id)
VALUES ('Boguyang', '耳机狗屎，不买。', '2.7', 2);
