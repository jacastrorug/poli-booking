define(['jquery', 'underscore', 'backbone', 'App',
        'text!templates/reservas/biblioteca/cubiculoEstudio.html'],
    function ($, _, Backbone, App, computadores) {

        var cubiculoEstudioView = Backbone.View.extend({
            el: $("#page"),

            render: function () {

                $('.menu li').removeClass('active');
                $('.menu li a[href="#"]').parent().addClass('active');
                this.$el.html(cubiculoEstudio);
                App.lanzarEventoLoad();
            }

        });

        return cubiculoEstudioView;

    });